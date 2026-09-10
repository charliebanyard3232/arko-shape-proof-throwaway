// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class InvoiceGen1970 {

    Integer currency0
    BigDecimal displayName1
    BigDecimal quantity2
    Integer status3
    Boolean threshold4
    Integer priority5
    Boolean amount6
    String sortOrder7

    static constraints = {
        currency0 nullable: true
        displayName1 nullable: true
        quantity2 nullable: true
        status3 nullable: true
        threshold4 nullable: true
        priority5 nullable: true
        amount6 nullable: true
        sortOrder7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'billing_gen_1970'
    }

    String toString() { "InvoiceGen1970(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 446 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 5801 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 5493 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 3200 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 2303 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 7774 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 9109 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 9627 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 7253 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 9479 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 714 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 6034 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 494 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage13() { return 4108 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes14() { return 5716 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency15() { return 2738 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder16() { return 1621 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes17() { return 5299 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 8775 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 2578 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn20() { return 6126 }
}
