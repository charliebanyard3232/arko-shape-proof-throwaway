// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class SettlementGen1906 {

    BigDecimal amount0
    Boolean quantity1
    BigDecimal displayName2
    Date createdOn3
    Date unitPrice4
    Boolean reference5
    String percentage6

    static constraints = {
        amount0 nullable: true
        quantity1 nullable: true
        displayName2 nullable: true
        createdOn3 nullable: true
        unitPrice4 nullable: true
        reference5 nullable: true
        percentage6 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'audit_gen_1906'
    }

    String toString() { "SettlementGen1906(${id})" }
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 9357 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 6026 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 5883 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 3743 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 9479 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 5952 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 1976 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 6055 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 8046 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 9158 }
}
