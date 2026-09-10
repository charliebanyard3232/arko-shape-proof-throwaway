// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen1070 {

    BigDecimal status0
    Integer currency1
    Boolean percentage2
    Boolean externalId3
    String updatedOn4
    BigDecimal active5

    static constraints = {
        status0 nullable: true
        currency1 nullable: true
        percentage2 nullable: true
        externalId3 nullable: true
        updatedOn4 nullable: true, maxSize: 255
        active5 nullable: true
    }

    static mapping = {
        table 'audit_gen_1070'
    }

    String toString() { "WarehouseGen1070(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 5118 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 9146 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 1017 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 9812 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 1146 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 3307 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 5663 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 8069 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 6346 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 8425 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 8656 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 9719 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 6469 }
}
