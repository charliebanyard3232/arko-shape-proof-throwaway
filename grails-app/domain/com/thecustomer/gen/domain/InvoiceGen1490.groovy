// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class InvoiceGen1490 {

    String sequence0
    String quantity1
    Date percentage2
    String unitPrice3
    Date category4
    Integer region5
    BigDecimal code6

    static constraints = {
        sequence0 nullable: true, maxSize: 255
        quantity1 nullable: true, maxSize: 255
        percentage2 nullable: true
        unitPrice3 nullable: true, maxSize: 255
        category4 nullable: true
        region5 nullable: true
        code6 nullable: true
    }

    static mapping = {
        table 'tax_gen_1490'
    }

    String toString() { "InvoiceGen1490(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 1583 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 6534 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 7053 }
    /** Derived accessor for status (generated filler). */
    def computeStatus3() { return 4571 }
    /** Derived accessor for version (generated filler). */
    def computeVersion4() { return 629 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 7419 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 3876 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 7737 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 9350 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 3656 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 8239 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 7357 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 3673 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 4118 }
    /** Derived accessor for code (generated filler). */
    def computeCode14() { return 2001 }
    /** Derived accessor for region (generated filler). */
}
