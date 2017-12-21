require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for TechNexion boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PROVIDES += "u-boot"

SRCBRANCH = "tn-imx_v2016.03"
SRCREV = "5a46ee81057c68b5c6155b09a362240eb8356db6"
SRC_URI = "git://github.com/TechNexion-customization/uboot-imx-tn.git;branch=${SRCBRANCH} \
           "
S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
