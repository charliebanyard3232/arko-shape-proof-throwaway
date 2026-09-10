// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WorkflowGen6540 {

    String weightKg0
    Boolean sortOrder1
    Integer sequence2
    String priority3
    BigDecimal notes4

    static constraints = {
        weightKg0 nullable: true, maxSize: 255
        sortOrder1 nullable: true
        sequence2 nullable: true
        priority3 nullable: true, maxSize: 255
        notes4 nullable: true
    }

    static mapping = {
        table 'inventory_gen_6540'
    }

    String toString() { "WorkflowGen6540(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 5190 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 5594 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 5466 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 5203 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 2062 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 9476 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 4655 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 5781 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 6183 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 2792 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 1599 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 6876 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency12() { return 1234 }
}
