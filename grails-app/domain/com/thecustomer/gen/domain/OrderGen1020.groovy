// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class OrderGen1020 {

    Date updatedOn0
    String unitPrice1
    Integer version2
    Date quantity3
    Integer region4
    String weightKg5
    Boolean reference6
    Boolean sortOrder7

    static constraints = {
        updatedOn0 nullable: true
        unitPrice1 nullable: true, maxSize: 255
        version2 nullable: true
        quantity3 nullable: true
        region4 nullable: true
        weightKg5 nullable: true, maxSize: 255
        reference6 nullable: true
        sortOrder7 nullable: true
    }

    static mapping = {
        table 'audit_gen_1020'
    }

    String toString() { "OrderGen1020(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 1548 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 8475 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 6434 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 2205 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 1140 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 8137 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 1977 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 3775 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 4209 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 5142 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 1632 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 3432 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 5953 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 6591 }
    /** Derived accessor for version (generated filler). */
    def computeVersion14() { return 5669 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 8181 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice16() { return 5634 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder17() { return 4046 }
    /** Derived accessor for status (generated filler). */
    def computeStatus18() { return 1704 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes19() { return 4165 }
    /** Derived accessor for label (generated filler). */
    def computeLabel20() { return 7185 }
}
