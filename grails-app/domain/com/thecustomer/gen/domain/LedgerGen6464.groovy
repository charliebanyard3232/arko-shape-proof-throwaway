// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen6464 {

    String amount0
    BigDecimal sequence1
    BigDecimal status2
    Integer createdOn3
    String version4
    Date amount5
    BigDecimal displayName6
    Date label7

    static constraints = {
        amount0 nullable: true, maxSize: 255
        sequence1 nullable: true
        status2 nullable: true
        createdOn3 nullable: true
        version4 nullable: true, maxSize: 255
        amount5 nullable: true
        displayName6 nullable: true
        label7 nullable: true
    }

    static mapping = {
        table 'pricing_gen_6464'
    }

    String toString() { "LedgerGen6464(${id})" }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 9454 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 7018 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 9104 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 3048 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 594 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 744 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 8559 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 6280 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 7352 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 4442 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 1674 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 741 }
    /** Derived accessor for code (generated filler). */
}
