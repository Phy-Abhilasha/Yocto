SUMMARY = "Simple hello world  application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


SRC_URI = "file://hello.c \
	   file://CMakeLists.txt"

S = "${WORKDIR}"

inherit cmake
