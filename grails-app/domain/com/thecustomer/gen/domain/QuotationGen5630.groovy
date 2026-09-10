// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class QuotationGen5630 {

    BigDecimal priority0
    String notes1
    Integer active2
    Date quantity3
    BigDecimal label4
    String unitPrice5
    Integer code6
    Integer weightKg7

    static constraints = {
        priority0 nullable: true
        notes1 nullable: true, maxSize: 255
        active2 nullable: true
        quantity3 nullable: true
        label4 nullable: true
        unitPrice5 nullable: true, maxSize: 255
        code6 nullable: true
        weightKg7 nullable: true
    }

    static mapping = {
        table 'audit_gen_5630'
    }

    String toString() { "QuotationGen5630(${id})" }
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 6907 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 2069 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 3580 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 2176 }
    /** Derived accessor for version (generated filler). */
    def computeVersion4() { return 4310 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 1914 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 5594 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 7501 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 6524 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 2052 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 8433 }
    /** Derived accessor for sortOrder (generated filler). */
}
