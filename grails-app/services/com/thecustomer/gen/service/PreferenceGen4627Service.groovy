// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen4627Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 6 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 7902 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 4497 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 4326 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 8781 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 8230 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 6809 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 5075 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 7988 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 197 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 1916 }
    /** Derived accessor for label (generated filler). */
    def computeLabel11() { return 2685 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 8436 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 5207 }
    /** Derived accessor for description (generated filler). */
    def computeDescription14() { return 8259 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage15() { return 9313 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 8310 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId17() { return 5636 }
    /** Derived accessor for region (generated filler). */
    def computeRegion18() { return 6924 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg19() { return 3140 }
    /** Derived accessor for region (generated filler). */
    def computeRegion20() { return 7817 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence21() { return 6647 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName22() { return 3933 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold23() { return 2083 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency24() { return 6596 }
    /** Derived accessor for status (generated filler). */
    def computeStatus25() { return 3391 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn26() { return 1814 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg27() { return 1538 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg28() { return 869 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName29() { return 8223 }
    /** Derived accessor for priority (generated filler). */
    def computePriority30() { return 5650 }
    /** Derived accessor for code (generated filler). */
    def computeCode31() { return 1779 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold32() { return 7116 }
    /** Derived accessor for priority (generated filler). */
}
