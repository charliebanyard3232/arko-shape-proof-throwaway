// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class SettlementGen4570 {

    Date sequence0
    Date currency1
    String quantity2
    String unitPrice3
    Date unitPrice4
    Integer status5

    static constraints = {
        sequence0 nullable: true
        currency1 nullable: true
        quantity2 nullable: true, maxSize: 255
        unitPrice3 nullable: true, maxSize: 255
        unitPrice4 nullable: true
        status5 nullable: true
    }

    static mapping = {
        table 'messaging_gen_4570'
    }

    String toString() { "SettlementGen4570(${id})" }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 210 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 7588 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 7381 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 3776 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 9330 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 5637 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 8944 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 4648 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 2337 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 9655 }
}
