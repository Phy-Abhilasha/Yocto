SUMMARY = "Simple calculator application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS = "arith"

SRC_URI = "file://cal.c"

S = "${WORKDIR}"

do_compile(){
	${CC} ${CFLAGS} ${LDFLAGS} cal.c -o cal -lcal
	
}

do_install(){
        install -d ${D}${bindir}
        install -m 0755 cal ${D}${bindir}

}

ALLOW_EMPTY:${PN} = "1"
