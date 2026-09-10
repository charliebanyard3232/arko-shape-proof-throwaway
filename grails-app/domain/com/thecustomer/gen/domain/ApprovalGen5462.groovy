// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ApprovalGen5462 {

    BigDecimal priority0
    BigDecimal quantity1
    String sortOrder2
    BigDecimal threshold3
    Date createdOn4
    Boolean region5
    Date unitPrice6
    Boolean status7
    String quantity8

    static constraints = {
        priority0 nullable: true
        quantity1 nullable: true
        sortOrder2 nullable: true, maxSize: 255
        threshold3 nullable: true
        createdOn4 nullable: true
        region5 nullable: true
        unitPrice6 nullable: true
        status7 nullable: true
        quantity8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'reporting_gen_5462'
    }

    String toString() { "ApprovalGen5462(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 2814 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 9856 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 9360 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 8177 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 8991 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 4615 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 1075 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 4941 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 9059 }
}
