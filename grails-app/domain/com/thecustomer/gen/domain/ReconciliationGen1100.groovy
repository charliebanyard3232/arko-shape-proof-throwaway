// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReconciliationGen1100 {

    BigDecimal priority0
    BigDecimal description1
    Date status2
    Integer externalId3
    BigDecimal code4
    String active5

    static constraints = {
        priority0 nullable: true
        description1 nullable: true
        status2 nullable: true
        externalId3 nullable: true
        code4 nullable: true
        active5 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'catalogue_gen_1100'
    }

    String toString() { "ReconciliationGen1100(${id})" }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 4579 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 6386 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 2782 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 5011 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 7607 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 3010 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 4384 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 729 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 9092 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 4623 }
    /** Derived accessor for status (generated filler). */
    def computeStatus10() { return 3714 }
    /** Derived accessor for version (generated filler). */
    def computeVersion11() { return 4844 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 5998 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 4551 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 6877 }
}
