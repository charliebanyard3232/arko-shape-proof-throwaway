// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ForecastGen1590 {

    String currency0
    BigDecimal code1
    Boolean priority2
    Integer notes3
    Integer threshold4
    Date weightKg5
    Boolean externalId6
    Boolean quantity7
    Date weightKg8

    static constraints = {
        currency0 nullable: true, maxSize: 255
        code1 nullable: true
        priority2 nullable: true
        notes3 nullable: true
        threshold4 nullable: true
        weightKg5 nullable: true
        externalId6 nullable: true
        quantity7 nullable: true
        weightKg8 nullable: true
    }

    static mapping = {
        table 'logistics_gen_1590'
    }

    String toString() { "ForecastGen1590(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 9329 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 8190 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 1608 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 6278 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 1446 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 5880 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 1619 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 5266 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 8896 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 3136 }
}
