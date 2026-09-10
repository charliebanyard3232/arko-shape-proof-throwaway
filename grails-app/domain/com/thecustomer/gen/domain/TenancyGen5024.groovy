// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TenancyGen5024 {

    Integer displayName0
    String amount1
    String description2
    BigDecimal externalId3
    Integer updatedOn4
    Integer sortOrder5
    BigDecimal version6
    String percentage7

    static constraints = {
        displayName0 nullable: true
        amount1 nullable: true, maxSize: 255
        description2 nullable: true, maxSize: 255
        externalId3 nullable: true
        updatedOn4 nullable: true
        sortOrder5 nullable: true
        version6 nullable: true
        percentage7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'catalogue_gen_5024'
    }

    String toString() { "TenancyGen5024(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 4102 }
    /** Derived accessor for version (generated filler). */
    def computeVersion1() { return 7032 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 7452 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 8526 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 7766 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 3348 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 5800 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 3363 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 8572 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 7326 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 2152 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 1396 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn12() { return 5590 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 5708 }
    /** Derived accessor for category (generated filler). */
    def computeCategory14() { return 2913 }
    /** Derived accessor for percentage (generated filler). */
}
