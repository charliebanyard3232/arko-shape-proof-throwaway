// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ConsignmentGen0695 {

    Integer reference0
    Integer notes1
    BigDecimal currency2
    BigDecimal externalId3
    String currency4
    String amount5
    Date updatedOn6

    static constraints = {
        reference0 nullable: true
        notes1 nullable: true
        currency2 nullable: true
        externalId3 nullable: true
        currency4 nullable: true, maxSize: 255
        amount5 nullable: true, maxSize: 255
        updatedOn6 nullable: true
    }

    static mapping = {
        table 'catalogue_gen_0695'
    }

    String toString() { "ConsignmentGen0695(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 411 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 9611 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 2670 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 1140 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 7769 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 6804 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 8808 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 30 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 9432 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 1230 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 1036 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 4722 }
    /** Derived accessor for active (generated filler). */
}
