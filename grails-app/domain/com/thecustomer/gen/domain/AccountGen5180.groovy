// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AccountGen5180 {

    BigDecimal region0
    BigDecimal code1
    Integer externalId2
    BigDecimal sequence3
    String status4
    BigDecimal description5
    Date code6
    String unitPrice7
    Date version8

    static constraints = {
        region0 nullable: true
        code1 nullable: true
        externalId2 nullable: true
        sequence3 nullable: true
        status4 nullable: true, maxSize: 255
        description5 nullable: true
        code6 nullable: true
        unitPrice7 nullable: true, maxSize: 255
        version8 nullable: true
    }

    static mapping = {
        table 'identity_gen_5180'
    }

    String toString() { "AccountGen5180(${id})" }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 578 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 4180 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 8917 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 2596 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 7953 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 1309 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 4370 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 6332 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 1880 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 2719 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 7719 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 6660 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency12() { return 9526 }
    /** Derived accessor for status (generated filler). */
    def computeStatus13() { return 1284 }
    /** Derived accessor for category (generated filler). */
    def computeCategory14() { return 4496 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage15() { return 5593 }
}
