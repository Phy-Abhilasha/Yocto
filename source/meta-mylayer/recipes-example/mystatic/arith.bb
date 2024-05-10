DESCRIPTION = "Simple Calucaltor application"
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



do_compile(){
	${CC} ${CFLAGS} -c add.c -o add.o
	${CC} ${CFLAGS} -c sub.c -o sub.o
	${CC} ${CFLAGS} -c div.c -o div.o
	${CC} ${CFLAGS} -c mul.c -o mul.o
	${CC} ${CFLAGS} -c rem.c -o rem.o
	${CC} ${CFLAGS} -c print.c -o print.o
	ar rcs libcal.a add.o sub.o mul.o div.o rem.o print.o
}

do_install(){
        install -d ${D}${libdir}
        install -m 0644 libcal.a ${D}${libdir}

        install -d ${D}${includedir}
        install -m 0755 lib_cal.h ${D}${includedir}
}


ALLOW_EMPTY:${PN}  = "1"
