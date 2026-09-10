// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen6120 {

    Boolean reference0
    BigDecimal sequence1
    String reference2
    Boolean reference3
    Integer reference4
    Boolean code5
    Boolean code6
    BigDecimal displayName7

    static constraints = {
        reference0 nullable: true
        sequence1 nullable: true
        reference2 nullable: true, maxSize: 255
        reference3 nullable: true
        reference4 nullable: true
        code5 nullable: true
        code6 nullable: true
        displayName7 nullable: true
    }

    static mapping = {
        table 'reference_gen_6120'
    }

    String toString() { "LedgerGen6120(${id})" }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 184 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 9204 }
    /** Derived accessor for version (generated filler). */
    def computeVersion2() { return 5969 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 4966 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 9331 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 8696 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 9372 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 4933 }
    /** Derived accessor for updatedOn (generated filler). */
}
