DESCRIPTION = "Simple Calculator application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://print.c \
           file://add.c \
           file://sub.c \
           file://mul.c \
           file://div.c \
           file://rem.c \
           file://lib_cal.h"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} -c -fPIC add.c 
    ${CC} ${CFLAGS} -c -fPIC sub.c 
    ${CC} ${CFLAGS} -c -fPIC div.c 
    ${CC} ${CFLAGS} -c -fPIC mul.c 
    ${CC} ${CFLAGS} -c -fPIC rem.c 
    ${CC} ${CFLAGS} -c -fPIC print.c 
    ${CC} ${LDFLAGS} -shared -Wl,-soname,liblwl.so.1 -o liblwl.so.1.0 *.o
}

do_install() {
    install -d ${D}${libdir}
    install -m 0755 liblwl.so.1.0 ${D}${libdir}

    ln -s liblwl.so.1.0 ${D}${libdir}/liblwl.so.1
    ln -s liblwl.so.1 ${D}${libdir}/liblwl.so

    install -d ${D}${includedir}
    install -m 0644 lib_cal.h ${D}${includedir}
} 
