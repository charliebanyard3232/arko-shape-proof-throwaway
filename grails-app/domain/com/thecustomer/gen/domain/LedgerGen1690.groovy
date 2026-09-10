// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen1690 {

    BigDecimal threshold0
    String priority1
    Boolean notes2
    Integer reference3
    String sortOrder4
    Date updatedOn5
    Integer updatedOn6
    Date sortOrder7

    static constraints = {
        threshold0 nullable: true
        priority1 nullable: true, maxSize: 255
        notes2 nullable: true
        reference3 nullable: true
        sortOrder4 nullable: true, maxSize: 255
        updatedOn5 nullable: true
        updatedOn6 nullable: true
        sortOrder7 nullable: true
    }

    static mapping = {
        table 'tax_gen_1690'
    }

    String toString() { "LedgerGen1690(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 2092 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 9196 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 9627 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 4863 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 8848 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 6359 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 574 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 4954 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 1205 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 1383 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 6877 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 5819 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 2786 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 7505 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 3763 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage15() { return 2047 }
}
