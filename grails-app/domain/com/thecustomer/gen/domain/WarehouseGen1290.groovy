// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen1290 {

    String reference0
    Date region1
    Date sortOrder2
    Date amount3
    String displayName4
    String priority5
    Boolean sequence6
    Integer active7

    static constraints = {
        reference0 nullable: true, maxSize: 255
        region1 nullable: true
        sortOrder2 nullable: true
        amount3 nullable: true
        displayName4 nullable: true, maxSize: 255
        priority5 nullable: true, maxSize: 255
        sequence6 nullable: true
        active7 nullable: true
    }

    static mapping = {
        table 'settlement_gen_1290'
    }

    String toString() { "WarehouseGen1290(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 7284 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold1() { return 5612 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 2493 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 3013 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 6078 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 5464 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 879 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 1757 }
    /** Derived accessor for code (generated filler). */
}
