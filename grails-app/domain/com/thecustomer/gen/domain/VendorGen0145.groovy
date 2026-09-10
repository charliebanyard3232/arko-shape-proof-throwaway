// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class VendorGen0145 {

    Boolean reference0
    Integer weightKg1
    Integer threshold2
    String notes3
    Date sequence4
    Integer priority5
    String category6
    Boolean region7
    String amount8

    static constraints = {
        reference0 nullable: true
        weightKg1 nullable: true
        threshold2 nullable: true
        notes3 nullable: true, maxSize: 255
        sequence4 nullable: true
        priority5 nullable: true
        category6 nullable: true, maxSize: 255
        region7 nullable: true
        amount8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'audit_gen_0145'
    }

    String toString() { "VendorGen0145(${id})" }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 6927 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 3984 }
    /** Derived accessor for code (generated filler). */
    def computeCode2() { return 5666 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 9546 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 1495 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 9572 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 73 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 4260 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 9622 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 2875 }
}
