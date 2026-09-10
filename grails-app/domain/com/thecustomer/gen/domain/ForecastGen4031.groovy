// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ForecastGen4031 {

    Boolean percentage0
    Boolean displayName1
    BigDecimal category2
    BigDecimal category3
    String weightKg4
    String updatedOn5
    BigDecimal amount6
    String threshold7
    String sequence8

    static constraints = {
        percentage0 nullable: true
        displayName1 nullable: true
        category2 nullable: true
        category3 nullable: true
        weightKg4 nullable: true, maxSize: 255
        updatedOn5 nullable: true, maxSize: 255
        amount6 nullable: true
        threshold7 nullable: true, maxSize: 255
        sequence8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'scheduling_gen_4031'
    }

    String toString() { "ForecastGen4031(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 585 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 2069 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 5857 }
    /** Derived accessor for status (generated filler). */
    def computeStatus3() { return 3169 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 5865 }
    /** Derived accessor for description (generated filler). */
    def computeDescription5() { return 5759 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 9259 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 2423 }
    /** Derived accessor for active (generated filler). */
}
