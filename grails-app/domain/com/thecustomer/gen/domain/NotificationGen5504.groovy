// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class NotificationGen5504 {

    Integer createdOn0
    String category1
    BigDecimal amount2
    String notes3
    BigDecimal amount4
    BigDecimal sequence5
    String version6
    Integer displayName7
    Boolean reference8

    static constraints = {
        createdOn0 nullable: true
        category1 nullable: true, maxSize: 255
        amount2 nullable: true
        notes3 nullable: true, maxSize: 255
        amount4 nullable: true
        sequence5 nullable: true
        version6 nullable: true, maxSize: 255
        displayName7 nullable: true
        reference8 nullable: true
    }

    static mapping = {
        table 'audit_gen_5504'
    }

    String toString() { "NotificationGen5504(${id})" }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 9016 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 5842 }
    /** Derived accessor for status (generated filler). */
    def computeStatus2() { return 8712 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 8723 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 5693 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 349 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 8342 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 8421 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 4565 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 4604 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 1613 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 4917 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 1342 }
}
