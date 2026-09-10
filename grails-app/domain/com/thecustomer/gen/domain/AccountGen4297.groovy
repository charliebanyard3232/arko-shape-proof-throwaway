// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AccountGen4297 {

    BigDecimal sequence0
    BigDecimal quantity1
    String weightKg2
    Date priority3
    Date active4
    String sequence5
    String label6
    Boolean region7
    String code8

    static constraints = {
        sequence0 nullable: true
        quantity1 nullable: true
        weightKg2 nullable: true, maxSize: 255
        priority3 nullable: true
        active4 nullable: true
        sequence5 nullable: true, maxSize: 255
        label6 nullable: true, maxSize: 255
        region7 nullable: true
        code8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'reference_gen_4297'
    }

    String toString() { "AccountGen4297(${id})" }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 4109 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 5819 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 7428 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 9243 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 2406 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 1543 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 9434 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 9930 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 9712 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 1431 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 9905 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 7575 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 7549 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 5491 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold14() { return 7165 }
    /** Derived accessor for priority (generated filler). */
}
