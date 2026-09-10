// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class NotificationGen6200 {

    Integer percentage0
    Date externalId1
    String weightKg2
    Boolean quantity3
    String amount4
    String status5
    Date threshold6
    Integer priority7

    static constraints = {
        percentage0 nullable: true
        externalId1 nullable: true
        weightKg2 nullable: true, maxSize: 255
        quantity3 nullable: true
        amount4 nullable: true, maxSize: 255
        status5 nullable: true, maxSize: 255
        threshold6 nullable: true
        priority7 nullable: true
    }

    static mapping = {
        table 'tax_gen_6200'
    }

    String toString() { "NotificationGen6200(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 3286 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 1066 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 5373 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 5081 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 7282 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 6683 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 6092 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 952 }
    /** Derived accessor for threshold (generated filler). */
}
