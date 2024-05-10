SUMMARY = "Simple calculator application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS = "static"

SRC_URI = "file://main.c"

S = "${WORKDIR}"

do_compile(){
	${CC} ${CFLAGS} ${LDFLAGS} main.c -o main -lcal
	
}

do_install(){
        install -d ${D}${bindir}
        install -m 0755 main ${D}${bindir}

}

ALLOW_EMPTY:${PN} = "1"
