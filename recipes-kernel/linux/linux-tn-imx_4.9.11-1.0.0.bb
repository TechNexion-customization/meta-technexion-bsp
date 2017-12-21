# For TechNexion boards

LICENSE = "GPLv2"

require recipes-kernel/linux/linux-imx.inc

DEPENDS += "lzop-native bc-native"

TNLINUX_GITHUB_MIRROR ?= "git://github.com/TechNexion-customization/linux-imx-tn.git"

SRCBRANCH = "tn-imx_4.9.11_1.0.0_ga"

SRC_URI = "${TNLINUX_GITHUB_MIRROR};branch=${SRCBRANCH} \
           file://defconfig \
"

SRCREV = "18fd9016fb888002c4f3a01c5bc3c908c2ba6a83"
LOCALVERSION = "-1.0.0-technexion"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

