// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TariffGen2554 {

    Boolean label0
    Integer percentage1
    String displayName2
    Integer createdOn3
    BigDecimal reference4
    BigDecimal externalId5

    static constraints = {
        label0 nullable: true
        percentage1 nullable: true
        displayName2 nullable: true, maxSize: 255
        createdOn3 nullable: true
        reference4 nullable: true
        externalId5 nullable: true
    }

    static mapping = {
        table 'logistics_gen_2554'
    }

    String toString() { "TariffGen2554(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 690 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 5369 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 7980 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 4914 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 7666 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 2085 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 3510 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 4986 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 5784 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 3139 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 8413 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 9964 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 7649 }
}
