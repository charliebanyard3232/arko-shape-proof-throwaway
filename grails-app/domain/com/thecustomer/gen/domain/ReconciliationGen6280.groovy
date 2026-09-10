// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReconciliationGen6280 {

    Date sequence0
    String status1
    BigDecimal updatedOn2
    Date priority3
    BigDecimal reference4

    static constraints = {
        sequence0 nullable: true
        status1 nullable: true, maxSize: 255
        updatedOn2 nullable: true
        priority3 nullable: true
        reference4 nullable: true
    }

    static mapping = {
        table 'reporting_gen_6280'
    }

    String toString() { "ReconciliationGen6280(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 1195 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 3737 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 8778 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 2879 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 2735 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 8479 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 4758 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 4620 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 9133 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 2599 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 4732 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 7256 }
}
