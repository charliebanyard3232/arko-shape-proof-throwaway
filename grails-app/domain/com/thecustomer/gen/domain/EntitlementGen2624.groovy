// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class EntitlementGen2624 {

    Boolean priority0
    BigDecimal sortOrder1
    Boolean status2
    String createdOn3
    Integer currency4
    Boolean externalId5

    static constraints = {
        priority0 nullable: true
        sortOrder1 nullable: true
        status2 nullable: true
        createdOn3 nullable: true, maxSize: 255
        currency4 nullable: true
        externalId5 nullable: true
    }

    static mapping = {
        table 'catalogue_gen_2624'
    }

    String toString() { "EntitlementGen2624(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 5269 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 6224 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 7533 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 4986 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 3876 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 3430 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 3902 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 4168 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 3250 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 2469 }
    /** Derived accessor for displayName (generated filler). */
}
