// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReconciliationGen1160 {

    Boolean category0
    BigDecimal updatedOn1
    BigDecimal description2
    String amount3
    Boolean region4
    Date active5
    BigDecimal notes6
    Integer unitPrice7
    Date updatedOn8

    static constraints = {
        category0 nullable: true
        updatedOn1 nullable: true
        description2 nullable: true
        amount3 nullable: true, maxSize: 255
        region4 nullable: true
        active5 nullable: true
        notes6 nullable: true
        unitPrice7 nullable: true
        updatedOn8 nullable: true
    }

    static mapping = {
        table 'fulfilment_gen_1160'
    }

    String toString() { "ReconciliationGen1160(${id})" }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 4907 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 3430 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 6843 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 1044 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 8639 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 3519 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 6169 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 9563 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 6482 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 5868 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 8191 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 9003 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 7497 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 2213 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 1275 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 1940 }
    /** Derived accessor for code (generated filler). */
    def computeCode16() { return 8269 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount17() { return 8835 }
}
