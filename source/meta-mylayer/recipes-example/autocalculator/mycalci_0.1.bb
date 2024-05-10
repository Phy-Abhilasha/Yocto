DESCRIPTION = "Simple makefile application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://add.c \
	   file://sub.c \
	   file://mul.c \
	   file://div.c \
	   file://main.c \
	   file://header.h \
	   file://Makefile.am \
	   file://configure.ac \
	   file://NEWS \
	   file://AUTHORS \
	   file://README \
	   file://ChangeLog"

S = "${WORKDIR}"
inherit autotools


