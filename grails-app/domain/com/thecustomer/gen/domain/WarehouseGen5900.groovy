// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen5900 {

    BigDecimal label0
    Integer quantity1
    String currency2
    Date sortOrder3
    String displayName4
    Boolean unitPrice5

    static constraints = {
        label0 nullable: true
        quantity1 nullable: true
        currency2 nullable: true, maxSize: 255
        sortOrder3 nullable: true
        displayName4 nullable: true, maxSize: 255
        unitPrice5 nullable: true
    }

    static mapping = {
        table 'inventory_gen_5900'
    }

    String toString() { "WarehouseGen5900(${id})" }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 2512 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 6366 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 5068 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 9950 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 6441 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 2374 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 1917 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 7065 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 6670 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 6044 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 4229 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 1923 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 4294 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 7405 }
}
