SUMMARY = "Simple calculator application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS = "libmath"

SRC_URI = "file://calculator1.c"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} calculator1.c -o calculator1 -L${STAGING_LIBDIR} -lmath -Wl,--hash-style=gnu
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 calculator1 ${D}${bindir}
}
