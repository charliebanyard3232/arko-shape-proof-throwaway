// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DispatchGen2477 {

    String version0
    Date unitPrice1
    String threshold2
    BigDecimal version3
    String sequence4
    Boolean region5
    Integer reference6
    String quantity7
    BigDecimal priority8

    static constraints = {
        version0 nullable: true, maxSize: 255
        unitPrice1 nullable: true
        threshold2 nullable: true, maxSize: 255
        version3 nullable: true
        sequence4 nullable: true, maxSize: 255
        region5 nullable: true
        reference6 nullable: true
        quantity7 nullable: true, maxSize: 255
        priority8 nullable: true
    }

    static mapping = {
        table 'procurement_gen_2477'
    }

    String toString() { "DispatchGen2477(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 3291 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 6960 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 1286 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 8855 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 142 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 4187 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 1882 }
}
