# For TechNexion boards

LICENSE = "GPLv2"

require recipes-kernel/linux/linux-imx.inc

DEPENDS += "lzop-native bc-native"

TNLINUX_GITHUB_MIRROR ?= "git://github.com/TechNexion/linux.git"

SRCBRANCH = "tn-imx_4.9.11_1.0.0_ga_test"

SRC_URI = "${TNLINUX_GITHUB_MIRROR};branch=${SRCBRANCH} \
           file://defconfig \
"

SRCREV = "015d775e416b47ab3a0db02fd6544f06c25568ce"
LOCALVERSION = "-1.0.0-technexion"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

