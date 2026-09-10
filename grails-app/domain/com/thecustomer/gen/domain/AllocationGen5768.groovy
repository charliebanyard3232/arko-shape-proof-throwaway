// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AllocationGen5768 {

    Date region0
    String weightKg1
    String createdOn2
    String priority3
    Date displayName4
    Boolean priority5
    BigDecimal active6
    Date displayName7

    static constraints = {
        region0 nullable: true
        weightKg1 nullable: true, maxSize: 255
        createdOn2 nullable: true, maxSize: 255
        priority3 nullable: true, maxSize: 255
        displayName4 nullable: true
        priority5 nullable: true
        active6 nullable: true
        displayName7 nullable: true
    }

    static mapping = {
        table 'identity_gen_5768'
    }

    String toString() { "AllocationGen5768(${id})" }
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 6140 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 5146 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 9520 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 6174 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 9268 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 4683 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 5142 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 5808 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 6566 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 7367 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 8778 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 7481 }
}
