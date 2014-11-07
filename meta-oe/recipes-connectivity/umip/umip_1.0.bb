SUMMARY = "Mobile IPv6 and NEMO for Linux"
DESCRIPTION = "UMIP is an open source implementation of Mobile IPv6 and NEMO \
Basic Support for Linux. It is released under the GPLv2 license. It supports \
the following IETF RFC: RFC6275 (Mobile IPv6), RFC3963 (NEMO), RFC3776 and \
RFC4877 (IPsec and IKEv2)."

HOMEPAGE = "http://umip.org/"
SECTION = "System Environment/Base"

SRC_URI = "git://git.umip.org/umip.git;tag=v${PV}"

DEPENDS = "rpm"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=073dc31ccb2ebed70db54f1e8aeb4c33"

S = "${WORKDIR}/git"

inherit autotools-brokensep

EXTRA_OE_CONF = "--enable-vt"
