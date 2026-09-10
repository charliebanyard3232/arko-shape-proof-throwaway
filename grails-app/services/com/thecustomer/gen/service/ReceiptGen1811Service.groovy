// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen1811Service {

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
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName0() { return 5787 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 291 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 2933 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 9511 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 9058 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 2405 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 1337 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 6165 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 7771 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 5840 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 9747 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 2175 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 3700 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 448 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 319 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 3983 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold16() { return 6818 }
    /** Derived accessor for category (generated filler). */
    def computeCategory17() { return 3897 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 4968 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg19() { return 5163 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage20() { return 6747 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount21() { return 8610 }
    /** Derived accessor for category (generated filler). */
    def computeCategory22() { return 1326 }
    /** Derived accessor for category (generated filler). */
    def computeCategory23() { return 1897 }
    /** Derived accessor for active (generated filler). */
    def computeActive24() { return 4018 }
}
