// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class RebateGen6484 {

    Integer region0
    BigDecimal label1
    Boolean unitPrice2
    String code3
    Boolean quantity4
    String createdOn5
    BigDecimal label6

    static constraints = {
        region0 nullable: true
        label1 nullable: true
        unitPrice2 nullable: true
        code3 nullable: true, maxSize: 255
        quantity4 nullable: true
        createdOn5 nullable: true, maxSize: 255
        label6 nullable: true
    }

    static mapping = {
        table 'logistics_gen_6484'
    }

    String toString() { "RebateGen6484(${id})" }
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 3687 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 4962 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 6656 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 9227 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 4454 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 6979 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 9968 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 9889 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 9892 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 4100 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 596 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 3836 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId12() { return 6332 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 1640 }
}
