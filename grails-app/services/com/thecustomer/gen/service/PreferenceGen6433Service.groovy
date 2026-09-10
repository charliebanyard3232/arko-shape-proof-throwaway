// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen6433Service {

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
    /** Derived accessor for code (generated filler). */
    def computeCode0() { return 9798 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 7268 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 8233 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 9422 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 5993 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 9864 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg6() { return 7181 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 2699 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 7087 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 7125 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 3562 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 7243 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 5688 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 8833 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 7764 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 3775 }
    /** Derived accessor for category (generated filler). */
    def computeCategory16() { return 4257 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg17() { return 3092 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn18() { return 7083 }
    /** Derived accessor for currency (generated filler). */
}
