// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ScheduleGen4822 {

    String reference0
    Date createdOn1
    Boolean active2
    Integer currency3
    String externalId4
    BigDecimal weightKg5

    static constraints = {
        reference0 nullable: true, maxSize: 255
        createdOn1 nullable: true
        active2 nullable: true
        currency3 nullable: true
        externalId4 nullable: true, maxSize: 255
        weightKg5 nullable: true
    }

    static mapping = {
        table 'identity_gen_4822'
    }

    String toString() { "ScheduleGen4822(${id})" }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 2688 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 8986 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 1078 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 6408 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 4646 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 4575 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 4023 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 4266 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 8234 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 1769 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 1323 }
    /** Derived accessor for sequence (generated filler). */
}
