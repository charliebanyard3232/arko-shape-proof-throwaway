// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class RouteGen4633 {

    String active0
    BigDecimal reference1
    String currency2
    String category3
    Integer currency4
    Boolean description5
    Date label6
    BigDecimal currency7

    static constraints = {
        active0 nullable: true, maxSize: 255
        reference1 nullable: true
        currency2 nullable: true, maxSize: 255
        category3 nullable: true, maxSize: 255
        currency4 nullable: true
        description5 nullable: true
        label6 nullable: true
        currency7 nullable: true
    }

    static mapping = {
        table 'settlement_gen_4633'
    }

    String toString() { "RouteGen4633(${id})" }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 6761 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 9304 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 363 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 9409 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 1751 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 7031 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 2910 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 761 }
    /** Derived accessor for description (generated filler). */
    def computeDescription8() { return 957 }
}
