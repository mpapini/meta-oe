require xorg-app-common.inc

SUMMARY = "X.Org X11 X client utilities"

DESCRIPTION = "xgamma allows X users to query and alter the gamma \
correction of a monitor via the X video mode extension."

LIC_FILES_CHKSUM = "file://COPYING;md5=ac9801b8423fd7a7699ccbd45cf134d8"

DEPENDS += "libxxf86vm"

BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "e8a88bf1a18f35b724619849dca97f4f"
SRC_URI[sha256sum] = "e5eb2588fbbdc5c2db5571b304204487a9c22eed15ac6cb816f605ec403e6e1a"
