// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DispatchGen1882 {

    Boolean amount0
    String description1
    Date threshold2
    Boolean code3
    BigDecimal notes4
    BigDecimal sortOrder5
    String region6
    Date description7
    Integer externalId8

    static constraints = {
        amount0 nullable: true
        description1 nullable: true, maxSize: 255
        threshold2 nullable: true
        code3 nullable: true
        notes4 nullable: true
        sortOrder5 nullable: true
        region6 nullable: true, maxSize: 255
        description7 nullable: true
        externalId8 nullable: true
    }

    static mapping = {
        table 'procurement_gen_1882'
    }

    String toString() { "DispatchGen1882(${id})" }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 8266 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 5216 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 5177 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder3() { return 5129 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 2434 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 3712 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 5822 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 6423 }
    /** Derived accessor for reference (generated filler). */
}
