# For TechNexion boards

LICENSE = "GPLv2"

require recipes-kernel/linux/linux-imx.inc

DEPENDS += "lzop-native bc-native"

TNLINUX_GITHUB_MIRROR ?= "git://github.com/TechNexion-customization/linux-imx-tn.git"

SRCBRANCH = "tn-imx_4.9.11_1.0.0_ga"

SRC_URI = "${TNLINUX_GITHUB_MIRROR};branch=${SRCBRANCH} \
           file://defconfig \
"

SRCREV = "a0692ce436e868278531aa65ca29cf5ce5a9d520"
LOCALVERSION = "-1.0.0-technexion"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

