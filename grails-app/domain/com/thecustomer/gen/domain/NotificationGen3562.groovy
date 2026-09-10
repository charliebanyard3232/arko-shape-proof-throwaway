// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class NotificationGen3562 {

    Date reference0
    BigDecimal region1
    String version2
    Date status3
    String createdOn4
    Integer notes5
    Integer category6

    static constraints = {
        reference0 nullable: true
        region1 nullable: true
        version2 nullable: true, maxSize: 255
        status3 nullable: true
        createdOn4 nullable: true, maxSize: 255
        notes5 nullable: true
        category6 nullable: true
    }

    static mapping = {
        table 'billing_gen_3562'
    }

    String toString() { "NotificationGen3562(${id})" }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 8507 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 5481 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 5707 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn3() { return 4453 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 2485 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 2591 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 4042 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 5956 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 1259 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 1977 }
}
