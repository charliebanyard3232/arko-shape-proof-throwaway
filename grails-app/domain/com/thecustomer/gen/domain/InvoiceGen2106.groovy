// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class InvoiceGen2106 {

    Date quantity0
    BigDecimal description1
    Date percentage2
    BigDecimal code3
    String notes4
    String description5

    static constraints = {
        quantity0 nullable: true
        description1 nullable: true
        percentage2 nullable: true
        code3 nullable: true
        notes4 nullable: true, maxSize: 255
        description5 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'billing_gen_2106'
    }

    String toString() { "InvoiceGen2106(${id})" }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 9057 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 4869 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 6265 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 4047 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 196 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 8986 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 224 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 4487 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 9736 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 8025 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 8251 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 2757 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 9313 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 3910 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 7059 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn15() { return 1044 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId16() { return 6468 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes17() { return 2593 }
    /** Derived accessor for updatedOn (generated filler). */
}
