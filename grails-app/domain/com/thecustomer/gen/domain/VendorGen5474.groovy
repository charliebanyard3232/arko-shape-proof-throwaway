// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class VendorGen5474 {

    Boolean description0
    BigDecimal displayName1
    String externalId2
    BigDecimal reference3
    Date createdOn4
    Boolean quantity5
    Date code6
    BigDecimal unitPrice7
    Boolean sortOrder8

    static constraints = {
        description0 nullable: true
        displayName1 nullable: true
        externalId2 nullable: true, maxSize: 255
        reference3 nullable: true
        createdOn4 nullable: true
        quantity5 nullable: true
        code6 nullable: true
        unitPrice7 nullable: true
        sortOrder8 nullable: true
    }

    static mapping = {
        table 'fulfilment_gen_5474'
    }

    String toString() { "VendorGen5474(${id})" }
    /** Derived accessor for code (generated filler). */
    def computeCode0() { return 3366 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 5720 }
    /** Derived accessor for code (generated filler). */
    def computeCode2() { return 1065 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 9958 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 1043 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 5259 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 8556 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 7531 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 2506 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 8361 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 9180 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 1572 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 7729 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 3548 }
}
