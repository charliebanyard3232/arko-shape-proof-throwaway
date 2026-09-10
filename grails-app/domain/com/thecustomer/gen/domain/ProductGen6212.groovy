// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ProductGen6212 {

    Boolean sequence0
    String description1
    BigDecimal sequence2
    Boolean notes3
    String sortOrder4
    String category5
    Boolean quantity6
    String threshold7

    static constraints = {
        sequence0 nullable: true
        description1 nullable: true, maxSize: 255
        sequence2 nullable: true
        notes3 nullable: true
        sortOrder4 nullable: true, maxSize: 255
        category5 nullable: true, maxSize: 255
        quantity6 nullable: true
        threshold7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'pricing_gen_6212'
    }

    String toString() { "ProductGen6212(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 6429 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 4191 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 9324 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 7463 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 9934 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 5962 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 2759 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 6002 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 8197 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 739 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 6829 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 3160 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 8203 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 7993 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount14() { return 693 }
}
