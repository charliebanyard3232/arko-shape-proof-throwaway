// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ManifestGen0134 {

    Date active0
    Date weightKg1
    Date active2
    Boolean weightKg3
    Integer sortOrder4
    String sortOrder5
    String category6
    String currency7

    static constraints = {
        active0 nullable: true
        weightKg1 nullable: true
        active2 nullable: true
        weightKg3 nullable: true
        sortOrder4 nullable: true
        sortOrder5 nullable: true, maxSize: 255
        category6 nullable: true, maxSize: 255
        currency7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'scheduling_gen_0134'
    }

    String toString() { "ManifestGen0134(${id})" }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 8439 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 2988 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 6793 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 6615 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 5904 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 3436 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 6916 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 4225 }
    /** Derived accessor for sortOrder (generated filler). */
}
