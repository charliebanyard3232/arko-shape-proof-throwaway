// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AllocationGen2547 {

    Boolean version0
    Integer unitPrice1
    String updatedOn2
    String displayName3
    BigDecimal quantity4

    static constraints = {
        version0 nullable: true
        unitPrice1 nullable: true
        updatedOn2 nullable: true, maxSize: 255
        displayName3 nullable: true, maxSize: 255
        quantity4 nullable: true
    }

    static mapping = {
        table 'pricing_gen_2547'
    }

    String toString() { "AllocationGen2547(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 7144 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 4330 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 7323 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 2486 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 7659 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 6098 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 6419 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 7208 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 3934 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 9383 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 6133 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 3130 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 7891 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 6471 }
}
